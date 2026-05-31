# |<<

**促销类型范围修订子实体 (sr_plcy_prm_r / nc.vo.sr.policy.revise.entity.PlcyPromotTypeReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5475.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_prmtype_r | 促销类型范围修订子实体 | pk_plcy_prmtype_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_prmtype | 促销类型范围子实体 | pk_plcy_prmtype | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | cpromottypeid | 促销类型 | cpromottypeid | varchar(20) |  | 促销类型定义实体 (scm_promottype) |
| 5 | brbtbaseflag | 参与返利依据计算 | brbtbaseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | brbtvalueflag | 参与返利值计算 | brbtvalueflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) |  | 主键 (UFID) |