# |<<

**财务组织视图样式 (org_vstl_finance / nc.vo.uap.rbac.orgview.FinanceGraphStyleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4202.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financegraphstyle | 主键 | pk_financegraphstyle | char(20) | √ | 主键 (UFID) |
| 2 | expandlayers | 图像展开最大层数 | expandlayers | int |  | 整数 (Integer) |
| 3 | maxnodesnum | 最大节点数 | maxnodesnum | int |  | 整数 (Integer) |
| 4 | graphbgcolor | 图像背景色 | graphbgcolor | varchar(50) |  | 字符串 (String) |
| 5 | graphbgstripe | 图像背景条纹 | graphbgstripe | int |  | 背景条纹样式 (gridstyleenum) |  | 0=点状型; |