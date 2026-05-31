# |<<

**患者过敏信息 (uh_pi_al / com.yonyou.yh.nhis.pi.pati.vo.PatiAlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6174.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patial | 患者过敏史主键 | pk_patial | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 主键 (UFID) |
| 5 | eu_mcsrc | 信息来源 | eu_mcsrc | int |  | 整数 (Integer) |
| 6 | dt_altype | 过敏类型 | dt_altype | char(20) |  | 主键 (UFID) |
| 7 | name_al | 过敏源 | name_al | varchar(50) |  | 字符串 (String) |
| 8 | date_al | 发现日期 | date_al | char(19) |  | 日期时间 (UFDateTime) |
| 9 | date_entry | 登记日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 10 | pk_psn | 登记人员 | pk_psn | varchar(20) |  | 主键 (UFID) |
| 11 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 12 | name_psn | 登记人员名称 | name_psn | varchar(50) |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |