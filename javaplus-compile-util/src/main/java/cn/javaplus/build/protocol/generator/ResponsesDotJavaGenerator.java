package cn.javaplus.build.protocol.generator;
//package cn.javaplus.crazy.protocol.generator;
//
//import japa.parser.ast.CompilationUnit;
//import japa.parser.ast.body.ClassOrInterfaceDeclaration;
//import japa.parser.ast.body.MethodDeclaration;
//import japa.parser.ast.type.Type;
//import japa.parser.ast.type.VoidType;
//
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import java.util.List;
//import java.util.Set;
//
//import cn.javaplus.comunication.annotations.Communication;
//import cn.javaplus.crazy.protocol.define.D;
//import cn.javaplus.crazy.protocol.util.Utils;
//import cn.javaplus.file.FileUtils;
//import cn.javaplus.util.Util;
//
//import com.google.common.collect.Sets;
//
//public class ResponsesDotJavaGenerator {
//
//	private Set<String> set = Sets.newHashSet();
//
//	public void generate(List<JavaFile> cs) {
//
//		StringWriter sw = new StringWriter();
//		PrintWriter out = new PrintWriter(sw);
//
//		buildHead(cs, out);
//
//		for (JavaFile c : cs) {
//			if (!c.containsAnnotation(Communication.class)) {
//				continue;
//			}
//			buildMethod(out, c);
//			out.println();
//		}
//
//		for (JavaFile c : cs) {
//			if (!c.containsAnnotation(Communication.class)) {
//				continue;
//			}
//			buildClass(out, c);
//			out.println();
//		}
//
//		buildTail(out);
//		out.flush();
//		out.close();
//		FileUtils.write(D.JAVA_RESPONSES_DOT_JAVA_PATH, sw.toString());
//	}
//
//	private void buildClass(PrintWriter out, JavaFile c) {
//		String s = c.getClassSimpleName();
//
//		String cc = Utils.getComment(c);
//
//		out.println(cc);
//		out.println("	public class " + s + " {");
//		buildMethods(out, c);
//		out.println("	}");
//	}
//
//	private void buildImports(PrintWriter out, JavaFile c) {
//		List<MethodDeclaration> methods = c.getMethods();
//
//		for (MethodDeclaration m : methods) {
//			Type type = m.getType();
//			if (!(type instanceof VoidType)) {
//				if (!Utils.isBaseType(type)) {
//
//					buildImport(c, out, m);
//				}
//			}
//		}
//	}
//
//	private void buildMethods(PrintWriter out, JavaFile c) {
//		List<MethodDeclaration> methods = c.getMethods();
//
//		for (MethodDeclaration m : methods) {
//			buildMethod(c, out, m);
//		}
//	}
//
//	private void buildImport(JavaFile c, PrintWriter out, MethodDeclaration m) {
//		String x = "import " + Utils.getFullPath(m) + ";";
//		if (!set.contains(x)) {
//			out.println(x);
//			set.add(x);
//		}
//	}
//
//	private void buildMethod(JavaFile c, PrintWriter out, MethodDeclaration m) {
//		out.println(Utils.getComment(m));
//		out.println("		public void response" + getMethodName(m) + " ("
//				+ buildArgs(m) + ") {");
//		out.println("			responser.response(" + buildClassName(m) + ", "
//				+ buildMethodName(m) + buildArg(m) + ");");
//		out.println("		}");
//	}
//
//	private String buildMethodName(MethodDeclaration m) {
//		return buildYinHao(m.getName());
//	}
//
//	private String buildClassName(MethodDeclaration m) {
//		ClassOrInterfaceDeclaration c = (ClassOrInterfaceDeclaration) m
//				.getParentNode();
//		CompilationUnit n = (CompilationUnit) c.getParentNode();
//		String packetName = Utils.getPacketName(n.getPackage());
//		if (packetName.isEmpty()) {
//			return c.getName();
//		} else {
//			return buildYinHao(packetName + "." + c.getName());
//		}
//	}
//
//	private String buildYinHao(String name) {
//		return "\"" + name + "\"";
//	}
//
//	private String buildArgs(MethodDeclaration m) {
//		Type type = m.getType();
//		if (type instanceof VoidType) {
//			return "";
//		} else {
//			return type + " o";
//		}
//	}
//
//	private String buildArg(MethodDeclaration m) {
//		if (m.getType() instanceof VoidType) {
//			return "";
//		} else {
//			return ", o";
//		}
//	}
//
//	private String getMethodName(MethodDeclaration m) {
//		String name = m.getName();
//		return Util.Str.firstToUpperCase(name);
//	}
//
//	private void buildMethod(PrintWriter out, JavaFile c) {
//		String s = c.getClassSimpleName();
//
//		out.println("	public " + s + " get" + s + "() {");
//		out.println("	 	return new " + s + "();");
//		out.println("	}");
//	}
//
//	private void buildTail(PrintWriter out) {
//
//		out.println("}");
//
//	}
//
//	private void buildHead(List<JavaFile> classz, PrintWriter out) {
//		out.println("package " + D.CLIENT_FILES_PACKAGE + ";");
//		out.println("");
//		out.println("import cn.javaplus.comunication.ProtocolUser;");
//		out.println("import cn.javaplus.crazy.server.Responser;");
//
//		for (JavaFile f : classz) {
//			if (!f.containsAnnotation(Communication.class)) {
//				continue;
//			}
//			buildImports(out, f);
//		}
//
//		out.println("");
//		out.println("public class Responses {");
//		out.println("");
//		out.println("	private Responser	responser;");
//		out.println("");
//		out.println("	public Responses(ProtocolUser user) {");
//		out.println("		responser = new Responser(user);");
//		out.println("	}");
//		out.println("");
//	}
//
// }
