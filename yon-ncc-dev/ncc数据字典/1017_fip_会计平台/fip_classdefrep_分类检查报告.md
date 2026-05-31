# |<<

**分类检查报告 (fip_classdefrep / nc.vo.fip.report.ClassDefReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2225.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_classdefreport | 实体标识 | pk_classdefreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_classdefine | 科目分类 | pk_classdefine | varchar(20) |  | 分类定义 (classdefine) |
| 4 | des_billtype | 目标单据 | des_billtype | varchar(50) |  | 字符串 (String) |
| 5 | src_billtype | 来源单据 | src_billtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_classfactor | 影响因素 | pk_classfactor | varchar(20) |  | 影响因素关联定义 (classfactor) |
| 7 | direction | 方向 | direction | varchar(50) |  | 方向 (classrepdir) |  | C=贷; |