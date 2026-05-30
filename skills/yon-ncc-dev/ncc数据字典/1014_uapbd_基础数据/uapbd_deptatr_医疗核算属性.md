# |<<

**医疗核算属性 (uapbd_deptatr / nc.vo.uapbd.deptatr.DeptAtrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5853.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptatr | 核算属性主键 | pk_deptatr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 核算属性编码 | code | varchar(60) |  | 字符串 (String) |
| 6 | name | 核算属性名称 | name | varchar(120) |  | 字符串 (String) |
| 7 | vhelpcode | 助记码 | vhelpcode | varchar(60) |  | 字符串 (String) |
| 8 | vmemo | 备注 | vmemo | varchar(300) |  | 字符串 (String) |
| 9 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态 (enablestate) |  | 1=未启用; |