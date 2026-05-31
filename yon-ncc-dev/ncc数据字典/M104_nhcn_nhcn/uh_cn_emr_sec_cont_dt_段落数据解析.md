# |<<

**段落数据解析 (uh_cn_emr_sec_cont_dt / com.yonyou.yh.nhis.cn.emr.scre.vo.EmrSecContDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_seccontdt | 段落数据解析主键 | pk_seccontdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_emrseccont | 医疗记录段落主键 | pk_emrseccont | varchar(50) |  | 字符串 (String) |
| 5 | dt_type | 内容类型 | dt_type | varchar(50) |  | 内容类型 (enum) |  | 1=段落; |