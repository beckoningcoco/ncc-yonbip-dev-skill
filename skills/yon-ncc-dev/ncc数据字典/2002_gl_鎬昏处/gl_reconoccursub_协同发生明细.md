# |<<

**协同发生明细 (gl_reconoccursub / nc.vo.gl.reconcile.occur.ReconOccurSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2464.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_occursub | 协同发生明细标识 | pk_occursub | char(20) | √ | 主键 (UFID) |
| 2 | pk_reconcileoccur | 协同发生pk | pk_reconcileoccur | char(20) |  | 主键 (UFID) |
| 3 | confirmer | 确认人 | confirmer | char(20) |  | 主键 (UFID) |
| 4 | confirmdate | 确认时间 | confirmdate | char(19) |  | 日期 (UFDate) |
| 5 | stat | 协同状态 | stat | int |  | 整数 (Integer) |
| 6 | pk_reconcile | 引用业务pk | pk_reconcile | char(20) |  | 主键 (UFID) |
| 7 | reconcilemessage | 协同信息 | reconcilemessage | varchar(50) |  | 字符串 (String) |
| 8 | pk_othervoucher | 对方凭证pk | pk_othervoucher | char(20) |  | 主键 (UFID) |
| 9 | pk_detailself | 本方分录pk | pk_detailself | char(20) |  | 主键 (UFID) |
| 10 | pk_detailother | 对方分录pk | pk_detailother | char(20) |  | 主键 (UFID) |
| 11 | pk_org | 组织 | pk_org | char(20) |  | 主键 (UFID) |
| 12 | pk_selfglbook | 本方帐簿 | pk_selfglbook | char(20) |  | 主键 (UFID) |
| 13 | pk_selfglorg | 本方主体 | pk_selfglorg | char(20) |  | 主键 (UFID) |
| 14 | pk_otherglbook | 对方帐簿 | pk_otherglbook | char(20) |  | 主键 (UFID) |
| 15 | pk_otherglorg | 对方主体 | pk_otherglorg | char(20) |  | 主键 (UFID) |
| 16 | pk_otherglorgbook | 对方主体帐簿 | pk_otherglorgbook | char(20) |  | 主键 (UFID) |
| 17 | pk_selfglorgbook | 本方主体帐簿 | pk_selfglorgbook | char(20) |  | 主键 (UFID) |
| 18 | pk_othercorp | 对方公司 | pk_othercorp | char(20) |  | 主键 (UFID) |
| 19 | isreconcile | 是否协同业务 | isreconcile | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | isdetailrecon | 是否分录协同 | isdetailrecon | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | pk_reconcilerule | 协同业务设置标识 | pk_reconcilerule | char(20) |  | 主键 (UFID) |