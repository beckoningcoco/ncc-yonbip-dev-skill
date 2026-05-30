# |<<

**凭证类别 (bd_vouchertype / nc.vo.bd.vouchertype.VoucherTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1154.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchertype | 凭证类别主键 | pk_vouchertype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 凭证类别编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 凭证类别名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | shortname | 凭证类别简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_currtype | 默认币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 8 | description | 凭证类别描述 | description | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |