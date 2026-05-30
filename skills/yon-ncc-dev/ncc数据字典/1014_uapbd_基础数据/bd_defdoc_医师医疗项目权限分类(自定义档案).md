# |<<

**医师医疗项目权限分类(自定义档案) (bd_defdoc / nc.vo.bd.defdoc.DefdocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/594.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_defdoc | 自定义档案主键 | pk_defdoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_defdoclist | 自定义档案列表主键 | pk_defdoclist | char(20) | √ | 自定义档案列表 (defdoclist) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | code | 档案编码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 档案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | pid | 上级档案 | pid | varchar(20) |  | 字符串 (String) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |