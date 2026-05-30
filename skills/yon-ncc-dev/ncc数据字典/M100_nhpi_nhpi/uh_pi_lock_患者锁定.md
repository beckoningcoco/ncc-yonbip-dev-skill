# |<<

**患者锁定 (uh_pi_lock / com.yonyou.yh.nhis.pi.patilock.vo.PatiLockVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6197.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patilock | 患者锁主键 | pk_patilock | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_locktype | 锁定类型 | pk_locktype | varchar(20) |  | 患者锁定类型(自定义档案) (Defdoc-000108) |
| 6 | dt_locktype | 锁定类型编码 | dt_locktype | varchar(50) |  | 字符串 (String) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |