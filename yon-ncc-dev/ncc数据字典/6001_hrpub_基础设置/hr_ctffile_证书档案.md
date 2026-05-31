# |<<

**证书档案 (hr_ctffile / nc.vo.hr.certificatefile.CtfFileVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2661.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctffile | 档案主键 | pk_ctffile | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | ctftypecode | 证书编码 | ctftypecode | varchar(50) | √ | 字符串 (String) |
| 5 | ctftypename | 证书名称 | ctftypename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | ctfkind | 证书类型 | ctfkind | varchar(20) | √ | 证书类型 (ctfkind) |
| 7 | ctftype | 证书类别 | ctftype | varchar(20) | √ | 证书类别 (ctftype) |
| 8 | vmemo | 备注 | vmemo | varchar(500) |  | 备注 (Memo) |
| 9 | professionqualification | 职业资格 | professionqualification | varchar(20) |  | 职业资格(自定义档案) (Defdoc-HR017_0xx) |
| 10 | profession | 职业 | profession | varchar(20) |  | 职业(自定义档案) (Defdoc-HR016_0xx) |
| 11 | qualificationgrade | 资格等级 | qualificationgrade | varchar(20) |  | 职业资格等级(自定义档案) (Defdoc-HR018_0xx) |
| 12 | trades | 工种 | trades | varchar(20) |  | 工种(自定义档案) (Defdoc-BD004_0xx) |
| 13 | ctfgrade | 证书等级 | ctfgrade | varchar(20) |  | 证书等级(自定义档案) (Defdoc-HR030_0xx) |
| 14 | setvalidtime | 设置有效期 | setvalidtime | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | validtime | 有效期（月） | validtime | int |  | 整数 (Integer) |  | [24 , 1] |
| 16 | ispointunit | 指定证书授予 | ispointunit | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |