# |<<

**临床_文档_段落_数据元 (uh_cn_emr_sec_de / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrSecDeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6004.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrsecde | 医疗记录段落数据元主键 | pk_emrsecde | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emr | 医疗记录 | pk_emr | varchar(20) |  | 临床_医疗记录 (unCNEmr) |
| 5 | pk_emrsec | 医疗记录段落 | pk_emrsec | varchar(20) |  | 临床_文档_段落 (uhCNEmrSec) |
| 6 | pk_emrdg | 数据组 | pk_emrdg | varchar(20) |  | 医疗记录数据组 (emrdg) |
| 7 | eu_emrdgfmt | 数据组格式分类 | eu_emrdgfmt | int |  | 数据组格式分类 (数据组格式分类) |  | 0=多列单记录; |