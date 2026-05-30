# |<<

**居民公卫领域流程管理 (bd_uh_peh_wf / com.yonyou.yh.nhis.bd.phdomainewf.vo.PhDomainEWfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1077.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pehwf | 居民公卫服务流程主键 | pk_pehwf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_ph | 公卫领域 | pk_ph | varchar(20) |  | 公卫领域定义 (phdomain) |
| 5 | sortno | 公卫领域内序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_pehwftype | 流程类型 | pk_pehwftype | varchar(20) |  | 公卫居民流程类型(自定义档案) (Defdoc-070007) |
| 7 | dt_pehwftype | 流程类型编码 | dt_pehwftype | varchar(50) |  | 字符串 (String) |
| 8 | code | 流程编码 | code | varchar(30) |  | 字符串 (String) |
| 9 | name | 流程名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 10 | pk_phds | 对应公卫数据集 | pk_phds | varchar(20) |  | 公卫服务数据集 (phds) |
| 11 | flag_op | 可门诊随访 | flag_op | varchar(50) |  | 数据集判断 (TruefalseEnum) |  | 0=是; |