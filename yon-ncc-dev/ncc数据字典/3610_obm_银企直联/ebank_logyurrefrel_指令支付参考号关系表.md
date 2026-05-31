# |<<

**指令支付参考号关系表 (ebank_logyurrefrel / nc.vo.obm.ebanklog.LogYurrefRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1771.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logyurrefrel | 关系主健 | pk_logyurrefrel | char(20) | √ | 主键 (UFID) |
| 2 | srcyurref | 合并源参考号 | srcyurref | varchar(50) |  | 字符串 (String) |
| 3 | destyurref | 合并后参考号 | destyurref | varchar(50) |  | 字符串 (String) |
| 4 | opdesc | 操作描述 | opdesc | varchar(100) |  | 字符串 (String) |