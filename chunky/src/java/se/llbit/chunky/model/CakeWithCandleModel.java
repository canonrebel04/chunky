package se.llbit.chunky.model;

import se.llbit.chunky.resources.Texture;
import se.llbit.math.Quad;
import se.llbit.math.Vector3;
import se.llbit.math.Vector4;

import java.util.Arrays;

public class CakeWithCandleModel extends QuadModel {

  private static final Texture bottom = Texture.cakeBottom;
  private static final Texture top = Texture.cakeTop;
  private static final Texture side = Texture.cakeSide;

  //region Cake With Candle
  private static final Quad[] quads = Model.join(
      new Quad[]{
          new Quad(
              new Vector3(1 / 16.0, 8 / 16.0, 15 / 16.0),
              new Vector3(15 / 16.0, 8 / 16.0, 15 / 16.0),
              new Vector3(1 / 16.0, 8 / 16.0, 1 / 16.0),
              new Vector4(1 / 16.0, 15 / 16.0, 1 - 15 / 16.0, 1 - 1 / 16.0)
          ),
          new Quad(
              new Vector3(1 / 16.0, 0 / 16.0, 1 / 16.0),
              new Vector3(15 / 16.0, 0 / 16.0, 1 / 16.0),
              new Vector3(1 / 16.0, 0 / 16.0, 15 / 16.0),
              new Vector4(1 / 16.0, 15 / 16.0, 15 / 16.0, 1 / 16.0)
          ),
          new Quad(
              new Vector3(1 / 16.0, 8 / 16.0, 15 / 16.0),
              new Vector3(1 / 16.0, 8 / 16.0, 1 / 16.0),
              new Vector3(1 / 16.0, 0 / 16.0, 15 / 16.0),
              new Vector4(15 / 16.0, 1 / 16.0, 8 / 16.0, 0 / 16.0)
          ),
          new Quad(
              new Vector3(15 / 16.0, 8 / 16.0, 1 / 16.0),
              new Vector3(15 / 16.0, 8 / 16.0, 15 / 16.0),
              new Vector3(15 / 16.0, 0 / 16.0, 1 / 16.0),
              new Vector4(1 / 16.0, 15 / 16.0, 8 / 16.0, 0 / 16.0)
          ),
          new Quad(
              new Vector3(1 / 16.0, 8 / 16.0, 1 / 16.0),
              new Vector3(15 / 16.0, 8 / 16.0, 1 / 16.0),
              new Vector3(1 / 16.0, 0 / 16.0, 1 / 16.0),
              new Vector4(1 - 15 / 16.0, 1 - 1 / 16.0, 8 / 16.0, 0 / 16.0)
          ),
          new Quad(
              new Vector3(15 / 16.0, 8 / 16.0, 15 / 16.0),
              new Vector3(1 / 16.0, 8 / 16.0, 15 / 16.0),
              new Vector3(15 / 16.0, 0 / 16.0, 15 / 16.0),
              new Vector4(15 / 16.0, 1 / 16.0, 8 / 16.0, 0 / 16.0)
          ),
          new Quad(
              new Vector3(7 / 16.0, 14 / 16.0, 9 / 16.0),
              new Vector3(9 / 16.0, 14 / 16.0, 9 / 16.0),
              new Vector3(7 / 16.0, 14 / 16.0, 7 / 16.0),
              new Vector4(0 / 16.0, 2 / 16.0, 8 / 16.0, 10 / 16.0)
          ),
          new Quad(
              new Vector3(7 / 16.0, 8 / 16.0, 7 / 16.0),
              new Vector3(9 / 16.0, 8 / 16.0, 7 / 16.0),
              new Vector3(7 / 16.0, 8 / 16.0, 9 / 16.0),
              new Vector4(0 / 16.0, 2 / 16.0, 0 / 16.0, 2 / 16.0)
          ),
          new Quad(
              new Vector3(7 / 16.0, 14 / 16.0, 9 / 16.0),
              new Vector3(7 / 16.0, 14 / 16.0, 7 / 16.0),
              new Vector3(7 / 16.0, 8 / 16.0, 9 / 16.0),
              new Vector4(2 / 16.0, 0 / 16.0, 8 / 16.0, 2 / 16.0)
          ),
          new Quad(
              new Vector3(9 / 16.0, 14 / 16.0, 7 / 16.0),
              new Vector3(9 / 16.0, 14 / 16.0, 9 / 16.0),
              new Vector3(9 / 16.0, 8 / 16.0, 7 / 16.0),
              new Vector4(2 / 16.0, 0 / 16.0, 8 / 16.0, 2 / 16.0)
          ),
          new Quad(
              new Vector3(7 / 16.0, 14 / 16.0, 7 / 16.0),
              new Vector3(9 / 16.0, 14 / 16.0, 7 / 16.0),
              new Vector3(7 / 16.0, 8 / 16.0, 7 / 16.0),
              new Vector4(2 / 16.0, 0 / 16.0, 8 / 16.0, 2 / 16.0)
          ),
          new Quad(
              new Vector3(9 / 16.0, 14 / 16.0, 9 / 16.0),
              new Vector3(7 / 16.0, 14 / 16.0, 9 / 16.0),
              new Vector3(9 / 16.0, 8 / 16.0, 9 / 16.0),
              new Vector4(2 / 16.0, 0 / 16.0, 8 / 16.0, 2 / 16.0)
          )
      },
      Model.rotateY(new Quad[]{
          new Quad(
              new Vector3(7.5 / 16.0, 15 / 16.0, 8 / 16.0),
              new Vector3(8.5 / 16.0, 15 / 16.0, 8 / 16.0),
              new Vector3(7.5 / 16.0, 14 / 16.0, 8 / 16.0),
              new Vector4(1 / 16.0, 0 / 16.0, 11 / 16.0, 10 / 16.0)
          ),
          new Quad(
              new Vector3(8.5 / 16.0, 15 / 16.0, 8 / 16.0),
              new Vector3(7.5 / 16.0, 15 / 16.0, 8 / 16.0),
              new Vector3(8.5 / 16.0, 14 / 16.0, 8 / 16.0),
              new Vector4(1 / 16.0, 0 / 16.0, 11 / 16.0, 10 / 16.0)
          )
      }, Math.toRadians(-45)),
      Model.rotateY(new Quad[]{
          new Quad(
              new Vector3(7.5 / 16.0, 15 / 16.0, 8 / 16.0),
              new Vector3(8.5 / 16.0, 15 / 16.0, 8 / 16.0),
              new Vector3(7.5 / 16.0, 14 / 16.0, 8 / 16.0),
              new Vector4(1 / 16.0, 0 / 16.0, 11 / 16.0, 10 / 16.0)
          ),
          new Quad(
              new Vector3(8.5 / 16.0, 15 / 16.0, 8 / 16.0),
              new Vector3(7.5 / 16.0, 15 / 16.0, 8 / 16.0),
              new Vector3(8.5 / 16.0, 14 / 16.0, 8 / 16.0),
              new Vector4(1 / 16.0, 0 / 16.0, 11 / 16.0, 10 / 16.0)
          )
      }, Math.toRadians(45)));
  //endregion

  private final Texture[] textures;

  public CakeWithCandleModel(Texture candle) {
    textures = new Texture[quads.length];
    Arrays.fill(textures, candle);
    System.arraycopy(new Texture[] {top, bottom, side, side, side, side}, 0, textures, 0, 6);
  }

  @Override
  public Quad[] getQuads() {
    return quads;
  }

  @Override
  public Texture[] getTextures() {
    return textures;
  }
}
