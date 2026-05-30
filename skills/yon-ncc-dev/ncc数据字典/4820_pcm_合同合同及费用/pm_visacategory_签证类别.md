# |<<

**签证类别 (pm_visacategory / nc.vo.pcm.visacategory.VisaCategoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4554.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_visacategory | 签证类别主键 | pk_visacategory | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | type_code | 签证类别编码 | type_code | varchar(40) |  | 字符串 (String) |
| 5 | type_name | 签证类别名称 | type_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | pk_parent | 上级签证类别 | pk_parent | varchar(20) |  | 签证类别 (pmvisacategory) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |