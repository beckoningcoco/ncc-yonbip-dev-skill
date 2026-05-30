# |<<

**服务控制_项目互斥_服务项目 (bd_uh_srv_react_item / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvReactItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1123.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvreactitem | 主键 | pk_srvreactitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_srvreact | 互斥关系 | pk_srvreact | char(20) |  | 主键 (UFID) |
| 5 | pk_srv | 服务项目 | pk_srv | varchar(20) |  | 主键 (UFID) |
| 6 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |