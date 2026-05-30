# |<<

**海关商品编码 (bd_goodscode / nc.vo.bd.goodscode.GoodscodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/854.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_goodscode | 海关商品编码主键 | pk_goodscode | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | code | 海关商品编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 海关商品名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | pk_customunit | 海关单位1 | pk_customunit | varchar(20) |  | 计量单位 (measdoc) |
| 7 | pk_customunitwo | 海关单位2 | pk_customunitwo | varchar(20) |  | 计量单位 (measdoc) |
| 8 | remark | 描述 | remark | varchar(1024) |  | 字符串 (String) |
| 9 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (enablestate) | 2 | 1=未启用; |