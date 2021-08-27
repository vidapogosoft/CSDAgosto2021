using System;
using Xunit;

namespace NetXUnit1
{
    public class UnitTest2
    {
        [Theory]
        [InlineData(3)]
        [InlineData(5)]
        [InlineData(6)]
        public void PassingTHeory(int value)
        {


            Assert.True(IsOdd(value));

        }

        [Theory]
        [InlineData(3)]
        public void PassingTHeory2(int value)
        {


            Assert.True(IsOdd(value));

        }

        public bool IsOdd(int x)
        {
            return x % 2 == 1;
        }
    }
}
