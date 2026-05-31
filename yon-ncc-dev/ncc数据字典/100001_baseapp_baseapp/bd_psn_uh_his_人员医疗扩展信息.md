# |<<

**人员医疗扩展信息 (bd_psn_uh_his / nc.vo.bd.psn.PsndocHisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/940.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psn_uh_his | 主键 | pk_psn_uh_his | char(20) | √ | 主键 (UFID) |
| 2 | pk_psn | 人员主键 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 3 | pk_psntype | 人员职业类型 | pk_psntype | varchar(20) |  | 人员类型(自定义档案) (Defdoc-010300) |
| 4 | pk_psnsrvtype | 医师医疗项目权限分类 | pk_psnsrvtype | varchar(20) |  | 医师医疗项目权限分类(自定义档案) (Defdoc-010305) |
| 5 | eu_medi | 处方权 | eu_medi | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | spec | 专长 | spec | varchar(4000) |  | 备注 (Memo) |
| 7 | note | 简介 | note | varchar(4000) |  | 备注 (Memo) |
| 8 | flag_chkin | 专家出诊标志 | flag_chkin | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_srv_chkin | 对应挂号登记时服务项目 | pk_srv_chkin | varchar(50) |  | 字符串 (String) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 12 | flag_norc | 麻醉处方权 | flag_norc | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | flag_psy | 精神处方权 | flag_psy | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | signingpic | 签名图片 | signingpic | image |  | 图片类型 (IMAGE) |
| 15 | hardwarenumber | 硬件串码 | hardwarenumber | varchar(50) |  | 字符串 (String) |
| 16 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 17 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 18 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 19 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 20 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 21 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 22 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 23 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 24 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 25 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 26 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 27 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 28 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 29 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 30 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 31 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 32 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 33 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 34 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 35 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |