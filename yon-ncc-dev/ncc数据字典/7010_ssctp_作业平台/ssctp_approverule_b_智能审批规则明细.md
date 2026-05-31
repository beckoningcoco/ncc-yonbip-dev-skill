# |<<

**智能审批规则明细 (ssctp_approverule_b / nc.vo.ssctp.sscapv.approverule.SSCApproveRuleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5636.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_approverule_b | 主键 | pk_approverule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 交易类型 (transtype) |
| 3 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 4 | pk_org | 单位范围 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 6 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 7 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 8 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |