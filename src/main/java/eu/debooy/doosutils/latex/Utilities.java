/*
 * Copyright 2008 Marco de Booij
 *
 * Licensed under the EUPL, Version 1.2 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * you may not use this work except in compliance with the Licence. You may
 * obtain a copy of the Licence at:
 *
 * https://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 */

package eu.debooy.doosutils.latex;


/**
 * @author Marco de Booij
 */
public final class Utilities {
  private Utilities() {}

  public static String kwart(Double value) {
    String[]  displayString = {"",
                               "\\textonequarter",
                               "\\textonehalf",
                               "\\textthreequarters"};

    return displayString[(int)((value - value.intValue()) * 4)];
  }
}
