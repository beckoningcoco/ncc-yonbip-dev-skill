# |<<

**医疗服务自定义分类 (bd_uh_srvudcate / nc.vo.nhbd.srv.SrvUDCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1135.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_udcate | 自定义分类主键 | pk_udcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 医疗服务分类编码 | code | varchar(30) | √ | 字符串 (String) |
| 5 | name | 医疗服务分类名称 | name | varchar(50) | √ | 字符串 (String) |
| 6 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 7 | name_invtemp | 发票模板 | name_invtemp | varchar(255) |  | 字符串 (String) |
| 8 | name_rpttemp | 报表模板 | name_rpttemp | varchar(255) |  | 字符串 (String) |
| 9 | innercode | 内联码 | innercode | varchar(50) |  | 字符串 (String) |
| 10 | pk_father | 上级 | pk_father | varchar(20) |  | 医疗服务自定义分类 (SrvUDCateVO) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |