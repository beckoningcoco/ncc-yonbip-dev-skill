# |<<

**患者就诊_账户 (uh_pv_acc / com.yonyou.yh.nhis.pv.adt.patiacc.vo.PatiaccVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6214.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvacc | 患者就诊账户主键 | pk_pvacc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (pvbanner) |
| 6 | cred | 信用额度 | cred | decimal(14, 2) |  | 数值 (UFDouble) |
| 7 | deposit | 住院预交金 | deposit | decimal(14, 2) |  | 数值 (UFDouble) |
| 8 | charged | 未结费用_本次就诊 | charged | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | pk_psn_ensure | 担保人 | pk_psn_ensure | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | name_psn_ensure | 担保人姓名 | name_psn_ensure | varchar(50) |  | 字符串 (String) |
| 11 | pk_psn_rec | 记录人 | pk_psn_rec | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | name_psn_rec | 记录人姓名 | name_psn_rec | varchar(50) |  | 字符串 (String) |
| 13 | date_rec | 记录时间 | date_rec | char(19) |  | 日期时间 (UFDateTime) |
| 14 | flag_canc | 取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | pk_psn_canc | 取消人 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | name_psn_canc | 取消人姓名 | name_psn_canc | varchar(50) |  | 字符串 (String) |
| 17 | date_canc | 取消时间 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 18 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |