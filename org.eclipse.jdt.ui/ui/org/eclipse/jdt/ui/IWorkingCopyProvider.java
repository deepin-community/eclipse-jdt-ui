/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.ui;

/**
 * Interface used for Java element content providers to indicate that
 * the content provider can return working copy elements for members
 * below compilation units.
 *
 * <p>
 * This interface is not intended to be implemented by clients.
 * </p>
 *
 * @see org.eclipse.jdt.ui.StandardJavaElementContentProvider
 *
 * @since 2.0
 *
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IWorkingCopyProvider {

	/**
	 * Returns <code>true</code> if the content provider returns working
	 * copy elements; otherwise <code>false</code> is returned.
	 *
	 * @return whether working copy elements are provided.
	 */
	boolean providesWorkingCopies();
}
