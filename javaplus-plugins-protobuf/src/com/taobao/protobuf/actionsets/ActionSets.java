package com.taobao.protobuf.actionsets;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import cn.javaplus.plugins.console.Debuger;

public class ActionSets implements IWorkbenchWindowActionDelegate {

	@Override
	public void run(IAction action) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

		Debuger.debug("ActionSets.selectionChanged()" + selection);
	}

	@Override
	public void dispose() {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO �Զ����ɵķ������

	}

}
