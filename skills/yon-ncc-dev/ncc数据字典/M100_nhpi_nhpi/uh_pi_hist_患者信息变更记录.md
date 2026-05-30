# |<<

**患者信息变更记录 (uh_pi_hist / com.yonyou.yh.nhis.pi.patiinfochg.vo.PatiInfoChgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6191.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patihist | 患者信息历史主键 | pk_patihist | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | date_edit | 更改日期 | date_edit | char(19) |  | 日期 (UFDate) |
| 6 | pk_pihisttype | 操作类型 | pk_pihisttype | varchar(20) |  | 患者信息修改操作类型(自定义档案) (Defdoc-000106) |
| 7 | dt_pihisttype | 操作类型编码 | dt_pihisttype | varchar(50) |  | 字符串 (String) |
| 8 | name_filed | 字段 | name_filed | varchar(50) |  | 字符串 (String) |
| 9 | desc_field | 字段描述 | desc_field | varchar(50) |  | 字符串 (String) |
| 10 | val_old | 变更前值 | val_old | varchar(256) |  | 字符串 (String) |
| 11 | val_new | 变更后值 | val_new | varchar(256) |  | 字符串 (String) |
| 12 | pk_psn | 变更人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | pk_org_exec | 变更机构 | pk_org_exec | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 14 | ipaddr | 机器IP地址 | ipaddr | varchar(50) |  | 字符串 (String) |
| 15 | computer | 计算机名称 | computer | varchar(50) |  | 字符串 (String) |
| 16 | note | 备注 | note | varchar(4000) |  | 字符串 (String) |
| 17 | name_psn | 变更人员姓名 | name_psn | varchar(50) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |