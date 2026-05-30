# |<<

**责任凭证_分摊追溯 (nresa_trace / nc.itf.nresa.rulescheme.trace.TraceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3904.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pktrace | 追踪主键 | pktrace | char(20) | √ | 主键 (UFID) |
| 2 | pkrule | 执行规则主键 | pkrule | varchar(20) |  | 分摊_分摊规则设置 (allocruleset) |
| 3 | pksection | 分摊规则段 | pksection | varchar(20) |  | 分摊_规则分段设置 (rulesection) |
| 4 | pksendvoucher | 发送方凭证 | pksendvoucher | varchar(20) |  | 责任凭证单 (DutyVoucher) |
| 5 | pksendentry | 发送方回冲分录 | pksendentry | varchar(20) |  | 责任凭证单分录 (DutyVoucherEntry) |
| 6 | pksendbalentry | 发送方平衡分录 | pksendbalentry | varchar(20) |  | 责任凭证单分录 (DutyVoucherEntry) |
| 7 | pksendassid | 发送方回冲辅助核算 | pksendassid | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 8 | pksendbalassid | 发送方平衡辅助核算 | pksendbalassid | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 9 | pkacptvoucher | 接收方凭证 | pkacptvoucher | varchar(20) |  | 责任凭证单 (DutyVoucher) |
| 10 | pkacptentry | 接收方摊派分录 | pkacptentry | varchar(20) |  | 责任凭证单分录 (DutyVoucherEntry) |
| 11 | pkacptbalentry | 接收方平衡分录 | pkacptbalentry | varchar(20) |  | 责任凭证单分录 (DutyVoucherEntry) |
| 12 | pkacptassid | 接收方摊派辅助核算 | pkacptassid | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 13 | pkacptbalassid | 接收方平衡辅助核算 | pkacptbalassid | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 14 | alloctype | 分摊方式 | alloctype | int |  | 接收规则 (receiveruleenum) |  | 0=成本动因; |