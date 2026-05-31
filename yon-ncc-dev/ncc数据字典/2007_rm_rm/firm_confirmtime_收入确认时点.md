# |<<

**收入确认时点 (firm_confirmtime / nc.vo.rm.confirmtime.ConfirmTimeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2277.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_confirmtime | 主键 | pk_confirmtime | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(20) | √ | 单据类型 (BilltypeVO) |