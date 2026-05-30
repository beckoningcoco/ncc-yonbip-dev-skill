# |<<

**就诊 (uh_pv / com.yonyou.yh.nhis.pv.pvipregister.vo.PatiVisitIpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6211.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pv | 患者就诊主键 | pk_pv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | code | 就诊编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 7 | date_pvbegin | 就诊开始日期 | date_pvbegin | char(19) |  | 日期时间 (UFDateTime) |
| 8 | date_pvend | 就诊结束日期 | date_pvend | char(19) |  | 日期时间 (UFDateTime) |
| 9 | eu_status | 就诊状态 | eu_status | int |  | 就诊状态 (PvStatusEnum) |  | 0=就诊登记; |