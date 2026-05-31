# |<<

**证明模板 (hryf_prove_template / nccloud.dto.hryf.provetemplate.ProveTemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2758.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prove_template | 主键 | pk_prove_template | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 5 | pk_prove_type | 证明类型 | pk_prove_type | varchar(20) |  | 证明类型(自定义档案) (Defdoc-HRGX0002_0xx) |
| 6 | content | 模板内容 | content | image |  | 图片类型 (IMAGE) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | enable | 是否启用 | enable | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | customflag | 自定义上传 | customflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isgrouptemp | 是否为集团模板 | isgrouptemp | varchar(1) |  | 字符串 (String) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |