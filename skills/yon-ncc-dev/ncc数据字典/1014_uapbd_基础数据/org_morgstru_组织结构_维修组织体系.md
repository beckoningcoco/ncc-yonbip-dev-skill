# |<<

**组织结构_维修组织体系 (org_morgstru / nc.vo.ambd.morgstru.MaintainOrgStruVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4098.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_morgstru | 维修组织体系主键 | pk_morgstru | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | shortname | 简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |