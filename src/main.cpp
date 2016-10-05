#include <cstdio>
#include <type_traits>
#include <memory>
#include <atomic>
using ssize_t = std::make_signed_t<size_t>;

int main(void) {
  printf("Hello world\n");
  std::shared_ptr<int> x;
  auto y = atomic_load(&x);
  return 0;
}
