# |<<

**服务控制_项目互斥 (bd_uh_srv_react / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvReactVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1121.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvreact | 主键 | pk_srvreact | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | dt_reacttype | 互斥类型 | dt_reacttype | varchar(50) |  | 字符串 (String) |
| 7 | pk_reacttype | 互斥类型主键 | pk_reacttype | varchar(20) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |