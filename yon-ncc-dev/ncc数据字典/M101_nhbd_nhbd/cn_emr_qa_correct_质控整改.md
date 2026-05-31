# |<<

**质控整改 (cn_emr_qa_correct / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrQaCorrectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1594.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnemrqacorrect | 整改主键 | pk_cnemrqacorrect | char(20) | √ | 主键 (UFID) |
| 2 | pk_pv | 就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 3 | pk_cnemrqa | 质控主键 | pk_cnemrqa | varchar(20) |  | 质控主表 (cNEmrQaVO) |
| 4 | date_submit | 提交时间 | date_submit | char(19) |  | 日期时间 (UFDateTime) |
| 5 | pk_psn_qa | 质控医师 | pk_psn_qa | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | pk_psn_phy | 主治医师 | pk_psn_phy | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | date_correct | 整改时间 | date_correct | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_emr | 医疗记录主键 | pk_emr | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 9 | qa_note | 质控意见 | qa_note | varchar(4000) |  | 字符串 (String) |
| 10 | emr_text | 相关病例文本 | emr_text | varchar(4000) |  | 字符串 (String) |
| 11 | emr_pos | 病例文本开始位置 | emr_pos | int |  | 整数 (Integer) |
| 12 | emr_pos2 | 病例文本结束位置 | emr_pos2 | int |  | 整数 (Integer) |
| 13 | corrected | 整改完成标志 | corrected | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_psn_fix | 整改人 | pk_psn_fix | varchar(20) |  | 人员基本信息 (psndoc) |