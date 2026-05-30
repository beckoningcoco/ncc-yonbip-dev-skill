# |<<

**医嘱项目医疗服务 (bd_uh_auto_ex_srv / com.yonyou.nhis.bd.pub2.autoexsrv.vo.UhAutoExSrvceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1015.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_autoexsrv | 自动上账服务项目主键 | pk_autoexsrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_srv | 服务项目主键 | pk_srv | char(20) |  | 主键 (UFID) |
| 5 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 6 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |