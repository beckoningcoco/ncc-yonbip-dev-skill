# |<<

**条码规则(多版本) (bcbd_barcoderule / nc.vo.bcbd.barcoderule.BarCodeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/259.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barcoderule | 条码规则主键 | pk_barcoderule | char(20) | √ | 主键 (UFID) |
| 2 | pk_source | 原始版本 | pk_source | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_barappobj | 条码对象 | pk_barappobj | varchar(20) |  | 条码应用对象 (barappobject) |
| 6 | pk_bartype | 条码类型 | pk_bartype | varchar(20) |  | 条码类型 (bartype) |
| 7 | code | 规则编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | name | 规则名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | length | 总长度 | length | int |  | 整数 (Integer) |
| 10 | isretail | 适用零售 | isretail | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 12 | complement | 补位方式 | complement | int | √ | 补位方式 (complement) | 2 | 1=左补位; |