# |<<

**医疗记录模板流文件 (bd_emr_temp_fs / com.yonyou.yh.nhis.bd.emr.vo.EmrTmplFsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/828.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempfs | 医疗记录模板流文件主键 | pk_emrtempfs | char(20) | √ | 主键 (UFID) |
| 2 | pk_emrtemp | 医疗记录模板 | pk_emrtemp | varchar(20) |  | 医疗记录模板 (emrtemplate) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 5 | emrtempfs | 医疗记录模板流数据 | emrtempfs | image |  | BLOB (BLOB) |
| 6 | xmlschem | 编辑器XML结构 | xmlschem | image |  | BLOB (BLOB) |