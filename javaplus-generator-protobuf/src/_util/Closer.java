package _util;


import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Closer {

	public static void close(ResultSet rs, Statement stat) {

		close(rs);

		close(stat);
	}

	public static void close(ResultSet o) {

		if(o == null) {

			return;
		}

		try {

			o.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static void close(Statement o) {

		if(o == null) {

			return;
		}

		try {

			o.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static void close(Closeable... o) {

		for (Closeable c : o) {

			if(c != null) {

				try {

					c.close();

				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}
	}



	public static void close(Connection o) {

		if(o == null) {

			return;
		}

		try {

			o.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
