package tech.cassandre.trading.bot.issues;

import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.service.marketdata.MarketDataService;
import org.springframework.boot.test.context.TestConfiguration;
import tech.cassandre.trading.bot.test.util.junit.BaseMock;

import java.io.IOException;
import java.math.BigDecimal;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@TestConfiguration
public class Issue482Mock extends BaseMock {

    @Override
    public MarketDataService getXChangeMarketDataServiceMock() throws IOException {
        MarketDataService marketService = mock(MarketDataService.class);

        final BigDecimal value = new BigDecimal("1");
        // Replies for BTC/USDT.
        CurrencyPair cp = new CurrencyPair(Currency.ETH, Currency.BTC);
        given(marketService
                .getTicker(cp))
                .willReturn(
                        // Ticker 1.
                        new Ticker.Builder()
                                .instrument(xChangeCP1) // currency pair.
                                .open(value)            // open.
                                .last(value)            // last.
                                .bid(value)             // bid.
                                .ask(value)             // ask.
                                .high(value)            // high.
                                .low(value)             // low.
                                .vwap(value)            // wmap.
                                .volume(value)          // value.
                                .quoteVolume(value)     // quote volume.
                                .timestamp(null)        // timestamp.
                                .bidSize(value)         // bid size.
                                .askSize(value)         // ask size.
                                .build(),
                        // Ticker 2.
                        new Ticker.Builder()
                                .instrument(xChangeCP1) // currency pair.
                                .open(value)            // open.
                                .last(value)            // last.
                                .bid(value)             // bid.
                                .ask(value)             // ask.
                                .high(value)            // high.
                                .low(value)             // low.
                                .vwap(value)            // wmap.
                                .volume(value)          // value.
                                .quoteVolume(value)     // quote volume.
                                .timestamp(null)        // timestamp.
                                .bidSize(value)         // bid size.
                                .askSize(value)         // ask size.
                                .build(),
                        // Ticker 3.
                        new Ticker.Builder()
                                .instrument(xChangeCP1) // currency pair.
                                .open(value)            // open.
                                .last(value)            // last.
                                .bid(value)             // bid.
                                .ask(value)             // ask.
                                .high(value)            // high.
                                .low(value)             // low.
                                .vwap(value)            // wmap.
                                .volume(value)          // value.
                                .quoteVolume(value)     // quote volume.
                                .timestamp(null)        // timestamp.
                                .bidSize(value)         // bid size.
                                .askSize(value)         // ask size.
                                .build()
                        );
        return marketService;
    }

}
