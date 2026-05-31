# |<<

**外币汇率方案 (bd_exratescheme / nc.vo.bd.exratescheme.ExrateSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/835.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exratescheme | 外币汇率方案主键 | pk_exratescheme | char(20) | √ | 主键 (UFID) |
| 2 | code | 外币汇率方案编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 外币汇率方案名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | desciption | 外币汇率方案描述 | desciption | varchar(1024) |  | 备注 (Memo) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |