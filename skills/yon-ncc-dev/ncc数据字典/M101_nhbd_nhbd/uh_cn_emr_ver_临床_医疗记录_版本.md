# |<<

**临床_医疗记录_版本 (uh_cn_emr_ver / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrVerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6005.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrver | 医疗记录修改历史主键 | pk_emrver | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emr | 医疗记录 | pk_emr | varchar(20) |  | 临床_医疗记录 (unCNEmr) |
| 5 | verno | 版本号 | verno | varchar(20) |  | 字符串 (String) |
| 6 | flag_newver | 最新版本标志 | flag_newver | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | date_edit | 版本操作日期 | date_edit | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_psn_edit | 版本操作人员 | pk_psn_edit | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | name_psn_edit | 版本操作人员名称 | name_psn_edit | varchar(50) |  | 字符串 (String) |
| 10 | date_comfirm | 版本确认日期 | date_comfirm | char(19) |  | 日期时间 (UFDateTime) |
| 11 | pk_dept_comfirm | 版本确认人员 | pk_dept_comfirm | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | name_dept_comfirm | 版本确认人员名称 | name_dept_comfirm | varchar(50) |  | 字符串 (String) |
| 13 | pk_emredit | 修改原因 | pk_emredit | varchar(20) |  | 文书修改原因(自定义档案) (Defdoc-060307) |
| 14 | dt_emredit | 修改原因编码 | dt_emredit | varchar(20) |  | 字符串 (String) |
| 15 | desc_emredit | 修改原因描述 | desc_emredit | varchar(256) |  | 字符串 (String) |
| 16 | pk_emrsec | 临床文档段落主键 | pk_emrsec | varchar(20) |  | 临床_文档_段落 (uhCNEmrSec) |