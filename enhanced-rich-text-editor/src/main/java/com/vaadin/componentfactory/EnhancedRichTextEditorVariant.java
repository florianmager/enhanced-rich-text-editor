/*
 * Copyright 2000-2018 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.componentfactory;

/*
 * #%L
 * Vaadin EnhancedRichTextEditor for Vaadin 10
 * %%
 * Copyright (C) 2019 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 *
 * See the file license.html distributed with this software for more
 * information about licensing.
 *
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <http://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.flow.component.shared.ThemeVariant;

/**
 * Set of theme variants applicable for {@code vcf-enhanced-rich-text-editor}
 * component.
 */
//@Generated({ "Generator: com.vaadin.generator.ComponentGenerator#1.2-SNAPSHOT",
//        "WebComponent: Vaadin.RichTextEditorElement#1.0.0-alpha3",
//        "Flow#1.2-SNAPSHOT" })
public enum EnhancedRichTextEditorVariant implements ThemeVariant {
    LUMO_NO_BORDER("no-border"), LUMO_COMPACT("compact"), MATERIAL_NO_BORDER(
            "no-border");

    private final String variant;

    EnhancedRichTextEditorVariant(String variant) {
        this.variant = variant;
    }

    /**
     * Gets the variant name.
     *
     * @return variant name
     */
    public String getVariantName() {
        return variant;
    }
}
