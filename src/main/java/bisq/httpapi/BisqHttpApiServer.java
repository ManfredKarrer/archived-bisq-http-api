/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.httpapi;

import bisq.core.app.BisqFacade;

import lombok.extern.slf4j.Slf4j;

/**
 * HTTP API server. Gets a instance of BisqFacade passed to access data from the running Bisq instance.
 */
@Slf4j
public class BisqHttpApiServer {
    private BisqFacade bisqFacade;

    public BisqHttpApiServer(BisqFacade bisqFacade) {
        this.bisqFacade = bisqFacade;
    }

    public void blockUntilShutdown() {
        //TODO
    }
}
