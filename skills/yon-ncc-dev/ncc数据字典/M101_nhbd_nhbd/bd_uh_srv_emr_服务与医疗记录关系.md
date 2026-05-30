# |<<

**服务与医疗记录关系 (bd_uh_srv_emr / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvEmrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvecd | 服务文档主键 | pk_srvecd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_srv | 服务 | pk_srv | char(20) |  | 主键 (UFID) |
| 5 | sortno | 序号 | sortno | varchar(50) |  | 字符串 (String) |
| 6 | pk_emrtemp | 医疗记录模板 | pk_emrtemp | char(20) |  | 主键 (UFID) |
| 7 | dt_pvtypewftype | 文档就诊类型流程类型 | dt_pvtypewftype | varchar(50) |  | 字符串 (String) |
| 8 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |