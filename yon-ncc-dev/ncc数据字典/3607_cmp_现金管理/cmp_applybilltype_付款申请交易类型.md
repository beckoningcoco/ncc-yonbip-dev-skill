# |<<

**付款申请交易类型 (cmp_applybilltype / nc.vo.cmp.apply.ApplyBillTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1527.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applybilltype | 主键 | pk_applybilltype | char(20) | √ | 主键 (UFID) |
| 2 | isdefault | 是否默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | tradebilltype | 行业类型 | tradebilltype | int |  | 行业类型 (tradebilltype) |  | 1=通用申请; |