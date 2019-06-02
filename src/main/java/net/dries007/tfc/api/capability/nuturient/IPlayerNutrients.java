/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.api.capability.nuturient;

import net.dries007.tfc.util.agriculture.Nutrient;

public interface IPlayerNutrients
{
    float getNutrient(Nutrient nutrient);

    void addNutrient(Nutrient nutrient, float amount);
}
