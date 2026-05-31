# |<<

**死亡证明信息 (UH_CN_EMR_DEATH_CERT / com.yonyou.yh.nhis.bd.ecd.vo.CnEmrDeachCertVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5996.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_uhcnemrdeathcert | 死亡证明主键 | pk_uhcnemrdeathcert | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | code_cert | 死亡证明编码 | code_cert | varchar(17) |  | 字符串 (String) |