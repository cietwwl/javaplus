/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package cn.javaplus.twolegs.tests;

import cn.javaplus.twolegs.tests.utils.GdxTest;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.files.FileHandle;

/**
 * Tests playing back audio from the external storage.
 * 
 * @author mzechner
 */
public class ExternalMusicTest extends GdxTest {

	@Override
	public void create() {
		// copy an internal mp3 to the external storage
		FileHandle src = Gdx.files.internal("data/8.12.mp3");
		FileHandle dst = Gdx.files.external("8.12.mp3");
		src.copyTo(dst);

		// create a music instance and start playback
		Music music = Gdx.audio.newMusic(dst);
		music.play();
	}

	@Override
	public void dispose() {
		// delete the copy on the external storage
		Gdx.files.external("8.12.mp3").delete();
	}
}
