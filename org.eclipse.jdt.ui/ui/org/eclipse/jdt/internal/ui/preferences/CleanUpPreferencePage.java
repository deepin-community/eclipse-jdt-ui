/*******************************************************************************
 * Copyright (c) 2000, 2011 IBM Corporation and others.
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
package org.eclipse.jdt.internal.ui.preferences;


import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.PlatformUI;

import org.eclipse.jdt.internal.ui.IJavaHelpContextIds;
import org.eclipse.jdt.internal.ui.preferences.cleanup.CleanUpConfigurationBlock;
import org.eclipse.jdt.internal.ui.preferences.formatter.ProfileConfigurationBlock;

/*
 * The page to configure the clean up options.
 */
public class CleanUpPreferencePage extends ProfilePreferencePage {

	public static final String PREF_ID= "org.eclipse.jdt.ui.preferences.CleanUpPreferencePage"; //$NON-NLS-1$
	public static final String PROP_ID= "org.eclipse.jdt.ui.propertyPages.CleanUpPreferencePage"; //$NON-NLS-1$

	public CleanUpPreferencePage() {
		// only used when page is shown programmatically
		setTitle(PreferencesMessages.CleanUpPreferencePage_Title );
	}

	@Override
	public void createControl(Composite parent) {
	    super.createControl(parent);
    	PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), IJavaHelpContextIds.CLEAN_UP_PREFERENCE_PAGE);
	}

	@Override
	protected ProfileConfigurationBlock createConfigurationBlock(PreferencesAccess access) {
	    return new CleanUpConfigurationBlock(getProject(), access);
    }

	@Override
	protected String getPreferencePageID() {
		return PREF_ID;
	}

	@Override
	protected String getPropertyPageID() {
		return PROP_ID;
	}
}
