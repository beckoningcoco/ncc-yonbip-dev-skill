# |<<

**医疗记录模板段落流数据 (bd_emr_temp_sec_fs / com.yonyou.yh.nhis.bd.emr.vo.EmrTmplSecFsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/832.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempsecfs | 医疗记录模板段落主键 | pk_emrtempsecfs | char(20) | √ | 主键 (UFID) |
| 2 | pk_emrtempsec | 医疗记录模板段落 | pk_emrtempsec | varchar(20) |  | 医疗记录模板段落 (emrtmplsec) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 5 | emrtempsecfs | 医疗记录段落流数据 | emrtempsecfs | image |  | BLOB (BLOB) |
| 6 | xmlschem | 编辑器XML结构 | xmlschem | image |  | BLOB (BLOB) |