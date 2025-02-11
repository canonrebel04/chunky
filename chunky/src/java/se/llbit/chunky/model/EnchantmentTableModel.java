/* Copyright (c) 2012 Jesper Öqvist <jesper@llbit.se>
 *
 * This file is part of Chunky.
 *
 * Chunky is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Chunky is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with Chunky.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.llbit.chunky.model;

import se.llbit.chunky.resources.Texture;
import se.llbit.math.AABB;

public class EnchantmentTableModel extends AABBModel {
  private static final AABB[] aabbs = new AABB[]{ new AABB(0, 1, 0, .75, 0, 1) };
  private static final Texture[][] textures;
  static {
    Texture top = Texture.enchantmentTableTop;
    Texture bottom = Texture.enchantmentTableBottom;
    Texture side = Texture.enchantmentTableSide;
    textures = new Texture[][] {
        {side, side, side, side, top, bottom}
    };
  }

  @Override
  public AABB[] getBoxes() {
    return aabbs;
  }

  @Override
  public Texture[][] getTextures() {
    return textures;
  }
}
