# |<<

**约束关系明细 (bd_frelation_b / nc.vo.bd.feature.frelation.entity.FrelationBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfrelationbid | 约束关系明细 | cfrelationbid | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 3 | cfeatureid1 | 特征1 | cfeatureid1 | varchar(20) |  | 特征 (bd_feature) |
| 4 | vfvalue1 | 特征值明细1 | vfvalue1 | varchar(20) |  | 字符串 (String) |
| 5 | vfrealvalue1 | 真实特征值1 | vfrealvalue1 | varchar(20) |  | 字符串 (String) |
| 6 | vfvaluename1 | 特征值1 | vfvaluename1 | varchar(200) |  | 字符串 (String) |
| 7 | cfeatureid2 | 特征2 | cfeatureid2 | varchar(20) |  | 特征 (bd_feature) |
| 8 | vfvalue2 | 特征值明细2 | vfvalue2 | varchar(20) |  | 字符串 (String) |
| 9 | vfrealvalue2 | 真实特征值2 | vfrealvalue2 | varchar(20) |  | 字符串 (String) |
| 10 | vfvaluename2 | 特征值2 | vfvaluename2 | varchar(200) |  | 字符串 (String) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | vrelation | 约束关系 | vrelation | int |  | 关系 (FRelationType) |  | 1=互斥; |