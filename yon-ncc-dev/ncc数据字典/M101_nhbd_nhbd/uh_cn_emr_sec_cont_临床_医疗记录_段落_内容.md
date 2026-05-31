# |<<

**临床_医疗记录_段落_内容 (uh_cn_emr_sec_cont / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrSecContVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrseccont | 医疗记录段落内容主键 | pk_emrseccont | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emrsec | 医疗记录段落 | pk_emrsec | varchar(20) |  | 临床_文档_段落 (uhCNEmrSec) |
| 5 | pk_emrtempsec | 医疗记录段落临时 | pk_emrtempsec | varchar(50) |  | 字符串 (String) |
| 6 | secfs | 段落数据流 | secfs | image |  | BLOB (BLOB) |
| 7 | secxml | 段落XML结构数据 | secxml | image |  | BLOB (BLOB) |
| 8 | secfs_print | 段落打印数据流 | secfs_print | image |  | BLOB (BLOB) |
| 9 | flag_compress | 压缩标志 | flag_compress | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | timestamp | 时间戳 | timestamp | image |  | BLOB (BLOB) |