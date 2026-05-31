# |<<

**单据交易类型配置树 (pd_mpoqstree / nc.vo.pd.mpobjqryscheme.entity.MpoqsTreeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4360.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cnodeid | 节点主键 | cnodeid | char(20) | √ | 主键 (UFID) |
| 2 | cpnodeid | 父节点主键 | cpnodeid | char(20) |  | 字符串 (String) |
| 3 | cdisname | 显示名称 | cdisname | varchar(50) |  | 字符串 (String) |
| 4 | nseqno | 序号 | nseqno | int |  | 整数 (Integer) |
| 5 | fdemandsupply | 供需类型 | fdemandsupply | int |  | 整数 (Integer) |
| 6 | vbilltype | 单据类型 | vbilltype | int |  | 字符串 (String) |